#include "geralHeader.h"

//THIS IS A TEST/FUNCTIONAL FILE, IT HAS FUNCTIONS THAT SERVE NOT ONLY FOR TESTING BUT ALSO TO FIX CERTAIN THINGS IN RUN TIME
//IN CASE THE MATRIX HAS INCORRECT VALUES, BECAUSE THERE WAS TRASH IN THE SOCKET BUFFER, WE MUST HARDCODE RESET THIS MATRIX IN ORDER TO HAVE A CORRECT MATRIX OF THE WAREHOUSE!

void fixMatrix(){
	
	//THIS IS A TEST FUNCTION IN ORDER TO VERIFY THE INTEGRITY OF THE MATRIX
	
	int nCols = 19;
	int nRows = 21;
	
	int i;
	int j;
	
	int matrix[nRows][nCols];
	memset(matrix, 0, nRows*nCols*sizeof(int));

	//ROW 2
	matrix[1][3] = 2;
	matrix[1][5] = 2;
	matrix[1][13] = 2;
	matrix[1][15] = 2;
	
	//ROW 6
	matrix[5][1] = 1;
	matrix[5][18] = 1;
	matrix[5][8] = 1;
	matrix[5][9] = 1;
	matrix[5][10] = 1;
	matrix[5][11] = 1;
	
	//ROW 7
	matrix[6][1] = 1;
	matrix[6][18] = 1;
	matrix[6][8] = 1;
	matrix[6][9] = 1;
	matrix[6][10] = 1;
	matrix[6][11] = 1;
	
	//ROW 8
	matrix[7][1] = 1;
	matrix[7][18] = 1;
	matrix[7][8] = 1;
	matrix[7][9] = 1;
	matrix[7][10] = 1;
	matrix[7][11] = 1;
	
	//ROW 9
	matrix[8][1] = 1;
	matrix[8][18] = 1;
	matrix[8][8] = 1;
	matrix[8][9] = 1;
	matrix[8][10] = 1;
	matrix[8][11] = 1;
	
	//ROW 10
	matrix[9][1] = 1;
	matrix[9][18] = 1;
	matrix[9][8] = 1;
	matrix[9][9] = 1;
	matrix[9][10] = 1;
	matrix[9][11] = 1;
	
	//ROW 11
	matrix[10][1] = 1;
	matrix[10][18] = 1;
	matrix[10][8] = 1;
	matrix[10][9] = 1;
	matrix[10][10] = 1;
	matrix[10][11] = 1;
	
	//ROW 12
	matrix[11][1] = 1;
	matrix[11][18] = 1;
	matrix[11][8] = 1;
	matrix[11][9] = 1;
	matrix[11][10] = 1;
	matrix[11][11] = 1;
	
	//ROW 13
	matrix[12][1] = 1;
	matrix[12][18] = 1;
	matrix[12][8] = 1;
	matrix[12][9] = 1;
	matrix[12][10] = 1;
	matrix[12][11] = 1;
	
	//ROW 14
	matrix[13][1] = 1;
	matrix[13][18] = 1;
	matrix[13][8] = 1;
	matrix[13][9] = 1;
	matrix[13][10] = 1;
	matrix[13][11] = 1;
	
	//ROW 15
	matrix[14][1] = 1;
	matrix[14][18] = 1;
	matrix[14][8] = 1;
	matrix[14][9] = 1;
	matrix[14][10] = 1;
	matrix[14][11] = 1;
	
	//ROW 16
	matrix[15][1] = 1;
	matrix[15][18] = 1;
	matrix[15][8] = 1;
	matrix[15][9] = 1;
	matrix[15][10] = 1;
	matrix[15][11] = 1;
	
	//ROW 20
	matrix[20][4] = 2;
	matrix[20][14] = 2;
	
	//Assing values					
	for (i=0 ; i<nRows; i++){
		for (j=0 ; j<nCols ; j++){
			geralPlant[i * nCols + j] = matrix[i][j];
			
		}	
		
	}
				
	return;

}

//TEST FUNCTION

void mockRoute(info* st){
	
	//ROUTE MOCK | DOCK -> ORDER LOCATION
	
	st->routeLength = 22;
	
	//INITIAL LOCATION
	st->route[0].x = 3;
	st->route[0].y = 1;
	
	//1 MOVEMENT
	st->route[1].x = 3;
	st->route[1].y = 2;
	
	//2 MOVEMENT
	st->route[2].x = 4;
	st->route[2].y = 2;
	
	//3 MOVEMENT
	st->route[3].x = 5;
	st->route[3].y = 2;
	
	//4 MOVEMENT
	st->route[4].x = 6;
	st->route[4].y = 2;
	
	//5 MOVEMENT
	st->route[5].x = 7;
	st->route[5].y = 2;
	
	//6 MOVEMENT
	st->route[6].x = 8;
	st->route[6].y = 2;
	
	//7 MOVEMENT
	st->route[7].x = 9;
	st->route[7].y = 2;
	
	//8 MOVEMENT
	st->route[8].x = 10;
	st->route[8].y = 2;
	
	//9 MOVEMENT
	st->route[9].x = 11;
	st->route[9].y = 2;
	
	//10 MOVEMENT
	st->route[10].x = 12;
	st->route[10].y = 2;
	
	//11 MOVEMENT
	st->route[11].x = 13;
	st->route[11].y = 2;
	
	//12 MOVEMENT
	st->route[12].x = 14;
	st->route[12].y = 2;
	
	//13 MOVEMENT
	st->route[13].x = 15;
	st->route[13].y = 2;
	
	//14 MOVEMENT
	st->route[14].x = 16;
	st->route[14].y = 2;
	
	//15 MOVEMENT
	st->route[15].x = 17;
	st->route[15].y = 2;
		
	//16 MOVEMENT
	st->route[16].x = 17;
	st->route[16].y = 3;
	
	//17 MOVEMENT
	st->route[17].x = 17;
	st->route[17].y = 4;
	
	//18 MOVEMENT
	st->route[18].x = 17;
	st->route[18].y = 5;
	
	//19 MOVEMENT
	st->route[19].x = 17;
	st->route[19].y = 6;
	
	//20 MOVEMENT
	st->route[20].x = 17;
	st->route[20].y = 7;
	
	//21 MOVEMENT
	st->route[21].x = 17;
	st->route[21].y = 8;
	
}

//TEST FUNCTION

void mockRouteToDock(info* st){
	
	//ROUTE MOCK | DOCK -> ORDER LOCATION
	
	st->routeLength = 22;
	
	//INITIAL LOCATION
	st->route[0].x = 17;
	st->route[0].y = 8;
	
	//1 MOVEMENT
	st->route[1].x = 17;
	st->route[1].y = 7;
	
	//2 MOVEMENT
	st->route[2].x = 17;
	st->route[2].y = 6;
	
	//3 MOVEMENT
	st->route[3].x = 17;
	st->route[3].y = 5;
	
	//4 MOVEMENT
	st->route[4].x = 17;
	st->route[4].y = 4;
	
	//5 MOVEMENT
	st->route[5].x = 17;
	st->route[5].y = 3;
	
	//6 MOVEMENT
	st->route[6].x = 17;
	st->route[6].y = 2;
	
	//7 MOVEMENT
	st->route[7].x = 16;
	st->route[7].y = 2;
	
	//8 MOVEMENT
	st->route[8].x = 15;
	st->route[8].y = 2;
	
	//9 MOVEMENT
	st->route[9].x = 14;
	st->route[9].y = 2;
	
	//10 MOVEMENT
	st->route[10].x = 13;
	st->route[10].y = 2;
	
	//11 MOVEMENT
	st->route[11].x = 12;
	st->route[11].y = 2;
	
	//12 MOVEMENT
	st->route[12].x = 11;
	st->route[12].y = 2;
	
	//13 MOVEMENT
	st->route[13].x = 10;
	st->route[13].y = 2;
	
	//14 MOVEMENT
	st->route[14].x = 9;
	st->route[14].y = 2;
	
	//15 MOVEMENT
	st->route[15].x = 8;
	st->route[15].y = 2;
		
	//16 MOVEMENT
	st->route[16].x = 7;
	st->route[16].y = 2;
	
	//17 MOVEMENT
	st->route[17].x = 6;
	st->route[17].y = 2;
	
	//18 MOVEMENT
	st->route[18].x = 5;
	st->route[18].y = 2;
	
	//19 MOVEMENT
	st->route[19].x = 4;
	st->route[19].y = 2;
	
	//20 MOVEMENT
	st->route[20].x = 3;
	st->route[20].y = 2;
	
	//21 MOVEMENT
	st->route[21].x = 3;
	st->route[21].y = 1;
	
}

void mockRoute_2(info* st){
	
	//ROUTE MOCK | DOCK -> ORDER LOCATION
	
	st->routeLength = 20;
	
	//INITIAL LOCATION
	st->route[0].x = 4;
	st->route[0].y = 21;
	
	//1 MOVEMENT
	st->route[1].x = 4;
	st->route[1].y = 20;
	
	//2 MOVEMENT
	st->route[2].x = 4;
	st->route[2].y = 19;
	
	//3 MOVEMENT
	st->route[3].x = 4;
	st->route[3].y = 18;
	
	//4 MOVEMENT
	st->route[4].x = 4;
	st->route[4].y = 17;
	
	//5 MOVEMENT
	st->route[5].x = 4;
	st->route[5].y = 16;
	
	//6 MOVEMENT
	st->route[6].x = 4;
	st->route[6].y = 15;
	
	//7 MOVEMENT
	st->route[7].x = 4;
	st->route[7].y = 14;
	
	//8 MOVEMENT
	st->route[8].x = 4;
	st->route[8].y = 13;
	
	//9 MOVEMENT
	st->route[9].x = 4;
	st->route[9].y = 12;
	
	//10 MOVEMENT
	st->route[10].x = 4;
	st->route[10].y = 11;
	
	//11 MOVEMENT
	st->route[11].x = 4;
	st->route[11].y = 10;
	
	//12 MOVEMENT
	st->route[12].x = 4;
	st->route[12].y = 9;
	
	//13 MOVEMENT
	st->route[13].x = 4;
	st->route[13].y = 8;
	
	//14 MOVEMENT
	st->route[14].x = 4;
	st->route[14].y = 7;
	
	//15 MOVEMENT
	st->route[15].x = 4;
	st->route[15].y = 6;
		
	//16 MOVEMENT
	st->route[16].x = 4;
	st->route[16].y = 5;
		
	//17 MOVEMENT
	st->route[17].x = 5;
	st->route[17].y = 5;
	
	//18 MOVEMENT
	st->route[18].x = 6;
	st->route[18].y = 5;
	
	//19 MOVEMENT
	st->route[19].x = 7;
	st->route[19].y = 5;
	
}

void mockRouteToDock_2(info* st){
	
	//ROUTE MOCK | DOCK -> ORDER LOCATION
	
	st->routeLength = 20;
	
	//INITIAL LOCATION
	st->route[0].x = 7;
	st->route[0].y = 4;
	
	//1 MOVEMENT
	st->route[1].x = 6;
	st->route[1].y = 4;
	
	//2 MOVEMENT
	st->route[2].x = 5;
	st->route[2].y = 4;
	
	//3 MOVEMENT
	st->route[4].x = 4;
	st->route[4].y = 5;
	
	//4 MOVEMENT
	st->route[5].x = 4;
	st->route[5].y = 6;
	
	//5 MOVEMENT
	st->route[6].x = 4;
	st->route[6].y = 7;
	
	//6 MOVEMENT
	st->route[7].x = 4;
	st->route[7].y = 8;
	
	//7 MOVEMENT
	st->route[8].x = 4;
	st->route[8].y = 9;
	
	//8 MOVEMENT
	st->route[9].x = 4;
	st->route[9].y = 10;
	
	//9 MOVEMENT
	st->route[10].x = 4;
	st->route[10].y = 11;
	
	//10 MOVEMENT
	st->route[11].x = 4;
	st->route[11].y = 12;
	
	//11 MOVEMENT
	st->route[12].x = 4;
	st->route[12].y = 13;
	
	//12 MOVEMENT
	st->route[13].x = 4;
	st->route[13].y = 14;
	
	//13 MOVEMENT
	st->route[14].x = 4;
	st->route[14].y = 15;
	
	//14 MOVEMENT
	st->route[15].x = 4;
	st->route[15].y = 16;
		
	//15 MOVEMENT
	st->route[16].x = 4;
	st->route[16].y = 17;
	
	//16 MOVEMENT
	st->route[17].x = 4;
	st->route[17].y = 18;
	
	//17 MOVEMENT
	st->route[18].x = 4;
	st->route[18].y = 19;
	
	//18 MOVEMENT
	st->route[19].x = 4;
	st->route[19].y = 20;
	
	//19 MOVEMENT
	st->route[20].x = 4;
	st->route[20].y = 21;
	
}

void mockRoute_3_test(info* st){
	
	//ROUTE MOCK | DOCK -> ORDER LOCATION
	
	st->routeLength = 7;
	
	//INITIAL LOCATION
	st->route[0].x = 5;
	st->route[0].y = 1;
	
	//MOVEMENT 1
	st->route[1].x = 4;
	st->route[1].y = 2;
	
	//MOVEMENT 2
	st->route[2].x = 3;
	st->route[2].y = 2;
	
	//MOVEMENT 3
	st->route[3].x = 2;
	st->route[3].y = 2;
	
	//MOVEMENT 4
	st->route[4].x = 2;
	st->route[4].y = 3;
	
	//MOVEMENT 5
	st->route[5].x = 2;
	st->route[5].y = 4;
	
	//MOVEMENT 6
	st->route[6].x = 2;
	st->route[6].y = 5;
	
	
}

void mockRoute_4_test(info* st){
	
	//ROUTE MOCK | DOCK -> ORDER LOCATION
	
	st->routeLength = 8;
	
	//INITIAL LOCATION
	st->route[0].x = 3;
	st->route[0].y = 2;
	
	//MOVEMENT 1
	st->route[1].x = 4;
	st->route[1].y = 2;
	
	//MOVEMENT 2
	st->route[2].x = 4;
	st->route[2].y = 1;
	
	//MOVEMENT 3
	st->route[3].x = 4;
	st->route[3].y = 2;
	
	//MOVEMENT 4
	st->route[4].x = 5;
	st->route[4].y = 2;
	
	//MOVEMENT 5
	st->route[5].x = 6;
	st->route[5].y = 2;
	
	//MOVEMENT 6
	st->route[6].x = 6;
	st->route[6].y = 3;
	
	//MOVEMENT 7
	st->route[7].x = 6;
	st->route[7].y = 4;
	
}

void mockRoute_4_dock(info* st){
	
	//ROUTE MOCK | DOCK -> ORDER LOCATION
	
	st->routeLength = 20;
	
	//INITIAL LOCATION

	
}

void mockRoute_3_dock(info* st){
	
	//ROUTE MOCK | DOCK -> ORDER LOCATION
	

	
}

