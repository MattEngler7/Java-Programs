; Author: Tyler Foster, Matt Engler, Ernesto Joaquin
; Class: CIS123 Assembly Language
; File Name: TeamF_Lab4.asm
; Creation Date: 10/10/2019
; Program Description: TestArraySum, modify PUSH POP to USES on procedures. 
;                      
;                     

.386								;32 bit program.
.model flat,stdcall					;Memory model.
.stack 4096							;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword	;Exit procedure prototype.

.data
	array DWORD 10000h,20000h,30000h,40000h,50000h
	theSum DWORD ?

.code
main PROC
	mov esi,OFFSET array				; ESI points to array
	mov ecx,LENGTHOF array				; ECX = array count
	call ArraySum						; calculate the sum
	mov theSum,eax						; returned in EAX


	INVOKE ExitProcess,0			;Exit program
main ENDP

;-----------------------------------------------------
; ArraySum
; Calculates the sum of an array of 32-bit integers.
; Receives: ESI = the array offset
; ECX = number of elements in the array
; Returns: EAX = sum of the array elements
;-----------------------------------------------------
ArraySum PROC USES esi ecx
	mov eax,0						; set the sum to zero
L1:
	add eax,[esi]					; add each integer to sum
	add esi,TYPE DWORD				; point to next integer
	loop L1							; repeat for array size


	ret								; sum is in EAX
ArraySum ENDP

	;Procedures go here.

END main