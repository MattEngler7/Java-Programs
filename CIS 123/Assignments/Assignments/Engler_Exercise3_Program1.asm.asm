; Author: Matt Engler
; Class: CIS123 Assembly Language
; File Name: Engler_Exercise3_Program1.asm
; Creation Date: 10/9/19
; Program Description: This program is designed to loop through and array
;                      and calculate the sum of all the gaps between array elemements.
;                       

.386											;32 bit program.
.model flat,stdcall								;Memory model.
.stack 4096										;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword				;Exit procedure prototype.

.data
	myArray DWORD 0,2,5,9,10
	arraySize = ($-myArray)/TYPE myArray		;array size is calculated subtracting offset from current location.
	gapArray DWORD arraySize-1 DUP(?)			;gap is found by taking the size and subtracting it by 1.
	sum DWORD ?

.code
main PROC
	mov esi,0									;Makes esi 0.
	mov ecx,arraySize							;Moves size of the array (5) into ecx.
	dec ecx										;the array size is then decresed by 1 making it 4.

	Loop1:										;loop is created so that all elements are used in the array.
	mov eax,myArray[esi+4]						;updates the eax register.	
	sub eax,myArray[esi]						;subtracts values inside register eax.
	mov gapArray[esi],eax						;updates gap array.
	inc esi										;increment esi by 1 everytime in the loop.
	loop Loop1									;end off loop1

	mov sum,0									;update sum to 0.
	mov esi,0									;update esi to 0.

	mov ecx,arraySize							
	dec ecx

	Loop2:
	mov edx,gapArray[esi]						;moves gap to a temporary register.
	add sum,edx									;adds that register to the total value.
	inc esi										;increments esi by 1.
	loop Loop2


	INVOKE ExitProcess,0						;Exit program
main ENDP

	;Procedures go here.

END main