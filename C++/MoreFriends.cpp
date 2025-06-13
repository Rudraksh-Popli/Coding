#include <iostream>
using namespace std;

class Y;

class X
{
private:
    int data;

public:
    void setValue(int value)
    {
        data = value;
    }
    void getValue();
    friend void add(X, Y);
};

class Y
{
private:
    int num;

public:
    void setValue(int value)
    {
        num = value;
    }
    friend void add(X, Y);
};

void add(X o1, Y o2)
{
    cout << "Summing Data of X and Y gives me " << o1.data + o2.num << endl;
}

int main()
{
    X a1;
    a1.setValue(34);
    Y b1;
    b1.setValue(96);
    add(a1, b1);
    return 0;
}