#include <iostream>

class Stack {
private:
    int* array;
    int top;
    int capacity;

public:
    Stack(int size) {
        capacity = size;
        array = new int[capacity];
        top = -1;
    }

    ~Stack() {
        delete[] array;
    }

    bool isEmpty() {
        return top == -1;
    }

    bool isFull() {
        return top == capacity - 1;
    }

    void push(int value) {
        if (isFull()) {
            std::cout << "Stack is full. Cannot push element." << std::endl;
            return;
        }
        array[++top] = value;
    }

    int pop() {
        if (isEmpty()) {
            std::cout << "Stack is empty. Cannot pop element." << std::endl;
            return -1;
        }
        return array[top--];
    }
};

int main() {
    int stackSize;
    std::cout << "Enter the size of the stack: ";
    std::cin >> stackSize;

    Stack stack(stackSize);

    stack.push(10);
    stack.push(20);
    stack.push(30);

    std::cout << "Popped: " << stack.pop() << std::endl;
    std::cout << "Popped: " << stack.pop() << std::endl;

    return 0;
}

