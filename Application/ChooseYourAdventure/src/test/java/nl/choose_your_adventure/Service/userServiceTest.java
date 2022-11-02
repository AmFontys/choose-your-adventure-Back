package nl.choose_your_adventure.Service;

import nl.choose_your_adventure.Service.impl.userServiceImp;
import nl.choose_your_adventure.model.Entity.User;
import nl.choose_your_adventure.model.dta.UserDta;
import nl.choose_your_adventure.persistence.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

class UserServiceTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    userServiceImp userService;

    private UserDta userDta;

    private User user;
    @BeforeEach
    public void setup() {
        userRepository = Mockito.mock(UserRepository.class);
        userService = new userServiceImp(userRepository);

        userDta = UserDta.builder()
                .userid(200)
                .username("Ramen")
                .password("passwordEncoded")
                .keyword("key")
                .email("ramen@gmail.com")
                .ismod(false)
                .build();

        user = User.builder()
                .userid(200)
                .username("Ramen")
                .password("passwordEncoded")
                .keyword("key")
                .email("ramen@gmail.com")
                .ismod(false)
                .build();
    }

    @Test
    void getUsers() {
        // given - precondition or setup
        User user2 = User.builder()
                .userid(200)
                .username("Spaghetti")
                .password("passwordEncoded")
                .keyword("key")
                .email("Spaghetti@gmail.com")
                .ismod(false)
                .build();
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        given(userRepository.findAll()).willReturn(users);
// when -  action or the behaviour that we are going test
        List<User> actualUsers = userService.getUsers();
        // then - verify the output
        assertThat(actualUsers).isNotNull();
        assertThat(actualUsers.size()).isEqualTo(2);

    }

    @Test
    void updateUser_withValidInput() {
    }
    @Test
    void updateUser_withInValidInput() {
    }

    @Test
    void updateUser_withInValidId() {
    }
    @Test
    void updateUser_withUnknownUsername() {

    }

    @Test
    void deleteUser_withValidId() {

    }

    @Test
    void deleteUser_withInvalidId() {
    }
}