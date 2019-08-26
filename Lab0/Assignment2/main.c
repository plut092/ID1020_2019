#include <stdio.h>
#include <ctype.h>
//
// Created by Johan Engström on 2019-08-26.
// Program takes in stdin and filters 'a' to 'X'
//

int main( ) {

    int c;

    printf( "Enter some input: ");

    while ((c = getchar( )) != EOF){
        if (c == 'a')
            c = 'X';
        putchar( c );
    }

    return 0;
}

