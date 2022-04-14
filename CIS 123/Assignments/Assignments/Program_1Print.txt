; Author: Matt Engler
; Class: CIS123 Assembly Language
; File Name: Engler_Assignment3_Program2.asm
; Creation Date: 9/17/19
; Program Description: Program is designed to define data types of BYTE and so forth
;                      and initalize each variable to a value with its data type. 

.386								;32 bit program.
.model flat,stdcall					;Memory model.
.stack 4096							;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword	;Exit procedure prototype.
	
.code
main PROC
	mov eax,3						;moves 3 to register EAX
	mov ebx,4						;moves 4 to register EBX
	add eax,ebx						;add both EAX and EBX to get 7
	mov ecx,2						;moves 2 to register ECX
	mov edx,3						;moves 3 to register EDX
	add ecx,edx						;adds bith ECX and EDX
	sub eax,ecx						;takes both numbers from EAX and 
									;ECX and subtracts them

	

INVOKE ExitProcess,0				;Exit program
main ENDP

;Procedures go here.

END main