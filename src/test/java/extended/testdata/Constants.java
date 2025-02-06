package extended.testdata;

import extended.models.User;

public class Constants {
    public static final User DEFAULT_USER = User.builder()
            .id(0)
            .username("username")
            .firstName("name")
            .lastName("surname")
            .email("test@gmail.com")
            .password("p@ssw0rd")
            .phone("88005556677")
            .userStatus(0)
            .build();
}
