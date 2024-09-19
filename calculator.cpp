#include <iostream>
using namespace std;

int main() {
    int num1, num2;
    char op;

    // Input two numbers
    cout << "Enter first number:=> ";
    cin >> num1;
    cout << "Enter second number:=> ";
    cin >> num2;

    // Input  operation
    cout << "Enter operator [ +, -, *, / , % ] :=> ";
    cin >> op;

    
    switch (op) {
        case '+':
            cout << num1 << " + " << num2 << " = " << num1 + num2 << endl;
            break;

        case '-':
            cout << num1 << " - " << num2 << " = " << num1 - num2 << endl;
            break;

        case '*':
            cout << num1 << " * " << num2 << " = " << num1 * num2 << endl;
            break;

        case '%':
            cout << num1 << " % " << num2 << " = " << num1 % num2 << endl;
            break;

        case '/':
            // Check for division by zero
            if (num2 != 0)
                cout << num1 << " / " << num2 << " = " << num1 / num2 << endl;
            else
                cout << "Error: Division by zero is not allowed." << endl;
            break;
        

        default:
            cout << "Invalid operator" << endl;
    }

    return 0;
}
