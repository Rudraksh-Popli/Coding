#include <iostream>
#include <cmath>
using namespace std;

class Point
{
private:
    int x, y;

public:
    Point(int a, int b)
    {
        x = a;
        y = b;
    }

    void displayPoint()
    {
        cout << "The points are (" << x << "," << y << ")" << endl;
    }

    friend void distanceCalculator(Point, Point);
};

void distanceCalculator(Point d, Point z)
{
    float dist = sqrt(pow((d.x - z.x), 2) + pow((d.y - z.y), 2));
    cout << "Distance between (" << d.x << "," << d.y << ") and (" << z.x << "," << z.y << ") is " << dist << endl;
}

int main()
{
    Point p(1, 1);
    Point q(4, 6);

    p.displayPoint();
    q.displayPoint();

    distanceCalculator(p, q);

    return 0;
}