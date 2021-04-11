#include "Group.h"


int Group::total; //needs to be included in cpp if static
int Group::groups; 
std::vector<Group> Group::ObjList;
std::mutex mtx;


void Group::print() {
	std::cout << "class print \n";
	std::cout << ID + " \n";
}

Group::Group() { // constructor

}

Group::~Group() { // destructor
	//groups--;
	//ObjList.erase(ObjList.begin() + index); // remove using index - crash
}

bool Group::enter(int ID, int number) {
	if (total >= MAX_TOTAL) { // full
		printf("Museum is full \n");
		return false;
	}

	this->ID = ID; // set the group ID
	ObjList.push_back(*this); //add self object to object vector
	this->index = ObjList.size() - 1; // save the index
	this->number = number; //hold the number of people in the group
	total += number;
	groups++;

	printf("Group ID : %d has entered \n"
			"Number of visitors %d \n\n", ID, number);
	//start random timer
	int randTime;
	randTime = rand() % 15 + 1;
	Sleep(randTime * 1000); //in the museum for a random time
	printf("We are ready to leave [%d] \n", ID);

	this->departure(ID); //

	return true;
}

void Group::departure(int ID) { //static?
	//need locking?
	mtx.lock();
	//printf("Group ID : %d has left \n", ID);

	if (ObjList.size() > 0) {
		for (int i = 0; i < ObjList.size(); i++) {
			if (ObjList[i].ID == ID) { // the entree exists
				ObjList.erase(ObjList.begin() + i); // 
				//ObjList.erase(std::remove(ObjList.begin(), ObjList.end(), ObjList[i]), ObjList.end());
				total -= number; // reduce the total people
				groups--;

				printf("Group ID : %d has left \n", ID);
				break; //erase invalidates the iterator apparently, so use break after (assumes IDs are unique)
			}
		}
	}

	mtx.unlock();
	// else the ID doesn't exist
	
}
