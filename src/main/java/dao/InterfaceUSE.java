package dao;

import java.util.Scanner;

import dto.Plant;
import dto.Seed;
import dto.Signup;

public interface InterfaceUSE {
void login(String email, String password);
boolean addCustomer(String houseNo, String city, String state, int pincode, String firstNmae, String lastNmae,
		String password, String email);
boolean addSeed(Seed seed);
boolean addPlant(Plant plant);
void updateSeed( int id, Scanner sc);
void updatePlant(int id, Scanner sc);
}
