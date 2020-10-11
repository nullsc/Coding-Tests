#quick text formatter to remove tabs from a text file
#eg. q  1% -> q
#30/04/2020
#version 1

import sys

print("Simple File Formatter")

txtFile = "test.txt" #input file
outputFile = "output.txt" #output file
DELIMETER = '\t' #the part that you want to delete after


print(f"Opening: {txtFile}")
print(f"Writing to: {outputFile}")

with open(txtFile, 'rt') as file:
    for line in file:
        #print(line)
        newLine = line.split(DELIMETER) #split the string
        print(newLine[0].rstrip())
        with open(outputFile, 'at') as outFile:
            outFile.write(newLine[0].rstrip() + "\n")


print("Complete")
