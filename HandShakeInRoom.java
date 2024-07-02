// The given program will find the maximum number of handshakes in a room.
// Suppose there are N persons in a room. We have to find the maximum number of Handshakes possible. 
// Given the fact that any two persons shake hand only once.

/*
1. For the first person, there will be N-1 people to shake hands with
2. For second person, there will be N -1 people available 
but as he has already shaken hands with the first person, there will be N-1-1 = N-2 shake-hands
3. For third person, there will be N-1-1-1 = N-3, and So On…
Therefore the total number of handshake   =   ( N – 1 + N – 2 +….+ 1 + 0 )   =   ( (N-1) * N ) / 2.
*/

public class HandShakeInRoom {
    public static void main(String[] args) {
        int members = 10;
        System.out.println(((members-1)*members)/2);
    }
}