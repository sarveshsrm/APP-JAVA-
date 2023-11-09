#include <iostream>
using namespace std;

struct Customer {
    char* name;
    int age;
    char* address;
};

int main() {
    // Allocate memory for a customer
    Customer* customer = new Customer;

    // Allocate memory for the customer's name and address
    customer->name = new char[50];
    customer->address = new char[100];

    // Set the customer's information
    cout << "Enter customer name: ";
    cin.getline(customer->name, 50);
    cout << "Enter customer age: ";
    cin >> customer->age;
    cin.ignore();
    cout << "Enter customer address: ";
    cin.getline(customer->address, 100);

    // Display the customer's information
    cout << "Customer name: " << customer->name << endl;
    cout << "Customer age: " << customer->age << endl;
    cout << "Customer address: " << customer->address << endl;

    // Free the memory allocated for the customer's name and address
    delete[] customer->name;
    delete[] customer->address;

    // Free the memory allocated for the customer
    delete customer;

    return 0;
}
