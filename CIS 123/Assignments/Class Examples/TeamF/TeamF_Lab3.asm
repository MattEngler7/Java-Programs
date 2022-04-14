; Author: Tyler Foster, Matt Engler, Ernesto Joaquin
; Class: CIS123 Assembly Language
; File Name: TeamF_Lab2.asm
; Creation Date: 10/10/2019
; Program Description: Expression a=(b+c)-(d+1), procedure for b+c, second procedure for d+1, final result on register EAX.
;                      
;                     

.386								;32 bit program.
.model flat,stdcall					;Memory model.
.stack 4096							;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword	;Exit procedure prototype.

.data

.code
main PROC
	mov ebx,2						;move 2d into ebx
	mov ecx,1						;move 1d into ecx
	mov edx,1						;move 1d into edx

	CALL SUM_AB						;call SUM_AB procedure
	CALL SUM_D1						;call SUM_D1 procedure

	sub ebx,edx						;subtract (b+c)-(d+1)
	mov eax,ebx						;move ebx into eax

	INVOKE ExitProcess,0			;Exit program
main ENDP

SUM_AB PROC
	add ebx,ecx						;(c+b)
	ret
	SUM_AB ENDP

SUM_D1 PROC
	add edx,1						;(d+1)
	ret
	SUM_D1 ENDP

	;Procedures go here.

END main