; Author: Matt Engler
; Class: CIS123 Assembly Language
; File Name: Engler_Exercise5_Program1.asm
; Creation Date: 10/9/19
; Program Description: Loops and calculates the first seven values of 
;                      Fibonacci number seq.
;   

.386								;32 bit program.
.model flat,stdcall					;Memory model.
.stack 4096							;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword	;Exit procedure prototype.
INCLUDE Irvine32.inc

.data
	;Declare variables here.

.code
main PROC
	mov eax,1						;updates eax, to 1.
	mov ebx,0						;updates ebx to 0.
	mov edx,1						;updates edx to 1.
	mov ecx,6						;counts the number of times the loop will do.			

	Loop1:
	mov eax,ebx						;moves ebx to eax.
	add eax,edx						;add edx to eax.
	mov ebx,edx						;moves edx to ebx.
	mov edx,eax						;move eax to edx.
	loop Loop1						;loops 7 times.

	INVOKE ExitProcess,0			;Exit program
main ENDP

	;Procedures go here.

END main