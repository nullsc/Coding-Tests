#pragma once
#include <iostream>
#include <vector>
#include <array>
#include <time.h> // for random
#include <Windows.h> // Sleep function
#include <mutex> // thread locking

const int MAX_TOTAL = 30; //maxium people in museum

/*
Store all the group methods
*/
class Group
{
public:
	int ID; // use int instead of string so we an increment by 1
	void print();
	Group();
	~Group();
	bool enter(int ID, int number);
	void departure(int ID);
	static std::vector<Group> ObjList; //keep track of all objects

	static int total; // total amount of people in museum at one time
	static int groups; // total amount of groups in museum at one time

private:
	int index; // location in the vector, for erase
	int number; //how many in the curret group


};

