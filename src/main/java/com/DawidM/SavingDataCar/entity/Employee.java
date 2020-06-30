package com.DawidM.SavingDataCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long employeeId;
    @Column
    private String firstName;
    @Column
    private String SecondName;
    @Column
    private String email;
    @Column
    private String PhoneNumber;
}