package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


public class UserTest {

    User user;
    @BeforeEach
    void setUp(){
        user = new User("TestUser", "TestPass", false);
    }

    // Tests for class User
    @Test
    void RightNameRightPassReturnTrue(){
        String nameForCheck = "TestUser";
        String passForCheck = "TestPass";

        assertTrue(user.authenticate(nameForCheck, passForCheck));
    }

    @Test
    void RightNameWrongPassReturnFalse(){
        String nameForCheck = "TestUser";
        String passForCheck = "TestPass111111";

        assertFalse(user.authenticate(nameForCheck, passForCheck));
    }

    @Test
    void WrongNameRightPassReturnFalse(){
        String nameForCheck = "TestUser2222";
        String passForCheck = "TestPass";

        assertFalse(user.authenticate(nameForCheck, passForCheck));
    }

    @Test
    void WrongNameWrongPassReturnFalse(){
        String nameForCheck = "TestUser2222";
        String passForCheck = "TestPass11111";

        assertFalse(user.authenticate(nameForCheck, passForCheck));
    }

    //Tests for class UserRepository

    @Test
    void UserIdentifiedAddUser(){
        UserRepository userRepository = new UserRepository();
        String nameForCheck = "TestUser";
        String passForCheck = "TestPass";

        if (user.authenticate(nameForCheck, passForCheck)){
            userRepository.addUser(user);
        }

        assertTrue(userRepository.findByName(user.name));
    }

    @Test
    void UserNotIdentifiedDoNotAddUser(){
        UserRepository userRepository = new UserRepository();
        String nameForCheck = "TestUser2222";
        String passForCheck = "TestPass";

        if (user.authenticate(nameForCheck, passForCheck)){
            userRepository.addUser(user);
        }

        assertFalse(userRepository.findByName(user.name));
    }

    @Test
    void dropEveryoneExceptAdminsTest(){
        UserRepository userRepository = new UserRepository();
        User user1 = new User("TestUser1", "TestPass1", false);
        User user2 = new User("TestUser2", "TestPass2", false);
        User user3 = new User("TestUser3", "TestPass3", true);
        User user4 = new User("TestUser4", "TestPass4", true);
        User user5 = new User("TestUser5", "TestPass5", false);

        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
        userRepository.addUser(user4);
        userRepository.addUser(user5);
        userRepository.dropEveryoneExceptAdmins();

        assertFalse(userRepository.findByName(user1.name));
        assertFalse(userRepository.findByName(user2.name));
        assertTrue(userRepository.findByName(user3.name));
        assertTrue(userRepository.findByName(user4.name));
        assertFalse(userRepository.findByName(user5.name));
    }

}