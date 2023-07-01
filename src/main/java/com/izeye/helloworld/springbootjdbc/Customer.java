package com.izeye.helloworld.springbootjdbc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Customer.
 *
 * @author Johnny Lim
 */
@Data
@AllArgsConstructor
public class Customer {

    private long id;
    private String firstName;
    private String lastName;

}
