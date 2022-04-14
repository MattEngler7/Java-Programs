; Author: Matt Engler
; Class: CIS123 Assembly Language
; File Name: Engler_Exercise6_Program1.asm
; Creation Date: 10/9/19
; Program Description: Loops and calculates the first seven values of 
;                      Fibonacci number seq.
;   

.386										;32 bit program.
.model flat,stdcall							;Memory model.
.stack 4096									;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword			;Exit procedure prototype.

.data
	array DWORD 10d,20d,30d,40d,50d,60d,70d	;declared array

.code
main PROC
	mov esi,0								;update esi to 0.
	mov edi,(SIZEOF array-TYPE array)		;find the size of the array.
	mov ecx,LENGTHOF array/2				;find length of array and divide it by 2 and mov to ecx.

	LOOP1:									;loop until all values have been flipped.
	mov eax,array[esi]						;mov value of array to esi.
	xchg eax,array[edi]						;exchange value eax and value in array to to edi.
	mov array[esi],eax						;mov eax value back into the array at esi.
	add esi,TYPE array						;increment value of esi for the loop.
	sub edi,TYPE array						;subtract value of edi for the loop.
	loop LOOP1

	INVOKE ExitProcess,0			;Exit program
main ENDP

	;Procedures go here.

END main