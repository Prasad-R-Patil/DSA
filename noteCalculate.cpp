#include <iostream>
using namespace std;

int main() {
    int amount, fivehundreds,hundreds, fifties, twenties, ones, remainder;

    // Input the amount
    cout << "Enter the amount: ";
    cin >> amount;

    switch(1) {
        case 1:
            // Calculate 500 notes
            fivehundreds = amount / 500;
            remainder = amount % 500;
        case 2:
            // Calculate 100 notes
            hundreds = remainder / 100;
            remainder = amount % 100;

        case 3:
            // Calculate 50 notes
            fifties = remainder / 50;
            remainder = remainder % 50;

        case 4:
            // Calculate 20 notes
            twenties = remainder / 20;
            remainder = remainder % 20;

        case 5:
            // Calculate 1 notes
            ones = remainder / 1;
            remainder = remainder % 1;

        default:
            break;
    }

    // Output the results
    cout << "500 RS => " << fivehundreds << endl;
    cout << "100 RS => " << hundreds << endl;
    cout << "50 RS  => " << fifties << endl;
    cout << "20 RS  => " << twenties << endl;
    cout << "1 RS   => " << ones << endl;

    return 0;
}
