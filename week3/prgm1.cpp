#include <iostream>
float divide(float a, float b);
int main() {
    int num1, num2;
    char operation;
    std::cout << "Enter first number: ";
    std::cin >> num1;
    std::cout << "Enter second number: ";
    std::cin >> num2;
    std::cout << "Enter operation (+, -, *, /): ";
    std::cin >> operation;
    switch (operation) {
        case '+':
            std::cout << "Result: " << num1+num2 << std::endl;
            break;
        case '-':
            std::cout << "Result: " << num1-num2 << std::endl;
            break;
        case '*':
            std::cout << "Result: " << num1*num2 << std::endl;
            break;
        case '/':
            if (num2 != 0) {
                std::cout << "Result: " << divide(static_cast<float>(num1), static_cast<float>(num2)) << std::endl;
            } else {
                std::cout << "Error: Division by zero is not allowed." << std::endl;
            }
            break;
        default:
            std::cout << "Error: Invalid operation." << std::endl;
    }

    return 0;
}

float divide(float a, float b) {
    return a / b;
}

