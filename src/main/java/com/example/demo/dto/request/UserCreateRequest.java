package com.example.demo.dto.request;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreateRequest {
    String username;
    @Size(min = 8, message = "Password must be at least 8 chars")
    String password;
    String firstName;
    String lastName;
    Date dob;


}
