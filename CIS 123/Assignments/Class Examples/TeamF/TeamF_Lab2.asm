; Author: Tyler Foster, Matt Engler, Ernesto Joaquin
; Class: CIS123 Assembly Language
; File Name: TeamF_Lab2.asm
; Creation Date: 10/10/2019
; Program Description: Assigned values to registers 
;                      
;                     

.386								;32 bit program.
.model flat,stdcall					;Memory model.
.stack 4096							;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword	;Exit procedure prototype.

.data
	count DWORD 8
.code
main PROC
	mov eax,1						;moved values into each register.
	mov ecx,2
	mov edx,3
	mov ebx,4
	mov esi,5
	mov edi,6

	PUSHAD							;all registers pushed into stack.
	mov ecx,count					;set count to 8.

	LOOP1:
	pop eax							;pop each register into eax.
	loop LOOP1
	INVOKE ExitProcess,0			;Exit program
main ENDP


	;Procedures go here.

END main