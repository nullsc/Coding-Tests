#include <iostream>
#include <thread>
#include "Group.h"

int main() {


	std::cout << "Tour project \n";

	srand(time(NULL)); // seed random, for automation testing

	std::vector<std::thread> threads; //store all the threads

	// create thread array/vector
	std::vector<Group> List; //test

	
	
	for (int j = 0; j < 15; j++) {
		int randomVisitors;
		randomVisitors = rand() % 10 + 1;

		threads.push_back(std::thread([=]() //https://stackoverflow.com/questions/30217956/error-variable-cannot-be-implicitly-captured-because-no-default-capture-mode-h
			{
				Group nthread;

				//printf("Rand: %d \n", randomVisitors); //debug
				nthread.enter(j, randomVisitors); //use lambda to start threads
					
				
			}));

	for (auto& j : threads) { // tidy up the threads
		j.join();
		
	}

	return 0;
}
