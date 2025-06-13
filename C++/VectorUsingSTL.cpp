#include <iostream>
#include <vector>

using namespace std;

template <class T>
void display(vector<T> &v)
{
    cout << "Displaying This Vector" << endl;
    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << " ";
        // cout << v.at(i) << " ";
    }
    cout << endl;
}

int main()
{
    // vector<int> vec;
    int element, size = 5;

    // cout << "Enter the size of your vector" << endl;
    // cin >> size;
    // for (int i = 0; i < size; i++)
    // {
    //     cout << "Enter an element to add to this vector: ";
    //     cin >> element;
    //     vec.push_back(element);
    // }

    // display(vec);
    // // vec.pop_back();
    // vector<int>::iterator iter = vec.begin();
    // vec.insert(iter, 566);
    // display(vec);

    vector<int> vec1; // zero length integer vector

    vector<char> vec2(4); // 4-element character vector
    // vec2.push_back('5');
    // display(vec2);

    // vector<char> vec3(vec2); // 4-element character vector from vec2
    // display(vec3);

    vector<int> vec4(4, 30); // 6-element vector of 3s
    display(vec4);
    cout << vec4.size() << endl;

    return 0;
}