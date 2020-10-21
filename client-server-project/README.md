## Client and Server UDP Project

Overall Mark: 100%

The assignment requires two programs (client and server) in Java or Python, that implement the gamedescribed below.The client has to be coded according to the following specification.
•At startup, the client prompts for three stringsS1, S2, S3from the user.
•The client then:
1. sendsS1,S2andS3to the server in three distinct UDP packets;
2. waits for a stringRand an integernfrom the server (nis expected to be the sum of the lengthsS1,S2andS3);
3. after removing all characters ’#’ fromR, checks that the result is the same as the concatenationofS1,S2andS3;
4. checks if the receivednis the correct sum of the lengths ofS1,S2andS3;
5. displays the results of the checks.Example:The user entersS1asnet,S2aswor, andS3asking. It calculates the sumℓof the lengthsof the three strings, that isℓ= 10; it also calculates the the concatenation ofS1,S2andS3, that isC=networking. The client sends the three strings in three packets and then it receivesRasnet#wor#kingas well asnas 10. The client then removes the hash characters fromRobtainingnetworking; it checks thatthis is the same asC; then it checks thatn=ℓ. Finally, it displaysRandn, as well as the results of thetwo checks (this could be twoYES/NOstrings or any suitable message).The server has to be coded according to the following specification.

•The server constantly waits for UDP messages.

•The server waits fora sequence of three distinct UDP packetscontaining stringsS1.S2andS3.

•The server then:

1. computesRby concatenatingS1,S2andS3, adding two characters ’#’ as separators;
2. computesnas the sum of the lengths ofS1,S2andS3;
3. sendsRandnto the client as two distinct UDP packets.Example:the server receives S1 as net,S2aswor, andS3asking; computesn= 3 + 3 + 4 = 10 andRasnet#wor#king. 
Finally, it sendsRandnto the client.The student has to produce the result of the coursework as follows.
