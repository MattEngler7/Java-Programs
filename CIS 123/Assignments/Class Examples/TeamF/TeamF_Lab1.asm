; Author: Tyler Foster, Matt Engler, Ernesto Joaquin
; Class: CIS123 Assembly Language
; File Name: TeamF_Lab1.asm
; Creation Date: 10/10/2019
; Program Description: Push and pop
;                     
;                     

INCLUDE Irvine32.inc			;Use Irvine32 library.

COMMENT @
a. 1703808
b. 1703804
c. 4 bytes
d. 32 bit is equivalent to 4 bytes.
e. 5h
f. Step 2 pushes eax register into the stack preserving that value.
g. 7h
h. 5h
i. The stack function as LIFO so it takes the last value and places it into the given register or variable. 





@


.data
	  myVal1 DWORD 7h			;1

.code
main PROC
	  mov eax,5h				;2
	  PUSH eax					;3
	  PUSH myVal1				;4
	  mov ebx,eax				;5
	  POP eax					;6
	  POP myVal1				;7

	  INVOKE ExitProcess, 0



	exit						;Exit program.
main ENDP

	;Procedures go here.

END main