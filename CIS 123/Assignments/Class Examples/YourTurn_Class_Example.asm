; Author: Matt Engler & Michael Pomeroy & Adam Kramer
; Class: CIS123 Assembly Language
; File Name: YourTurn_Class_Example.asm
; Creation Date: 9/26/19
; Program Description: Describe with a short paragraph what your
;                      program does and its purpose. Explain in general
;                      terms the expected inputs and output result. 

.386								;32 bit program.
.model flat,stdcall					;Memory model.
.stack 4096							;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword	;Exit procedure prototype.

.data
		COMMENT !
		;slide 8
			arrayW DWORD 1000h,2000h,3000h		;DWORD array here.
		;slide 10
			arrayW DWORD 1000h,2000h,3000h		;DWORD array here.
			
		;slide 26
			intarray DWORD 100h,200h,300h,400h
			
		;slide 29
			source  BYTE  "This is the source string",0
			target  BYTE  SIZEOF source DUP(0)
			!


.code
	main PROC
		COMMENT !
		;slide 8
		mov esi,OFFSET arrayW	; gets offset of first array
		mov eax,[esi]			; moves first array member to AX
		add esi,4				; increases ESI address 4 bytes further
								; or using TYPE: add esi, DWORD arrayW
		add eax,[esi]			; add second array member to AX
		add esi,4				; increases ESI address 4 bytes further
		add eax,[esi]			; EAX=sum of the array

		;slide 10
		mov esi,0				; ESI = 0
		mov eax,[arrayW + esi] 	; moves 1st element of arrayW to eax
		mov eax,arrayW[esi]		; alternate format

		add esi,4				; moves second element of arrayW to esi
		add eax,[arrayW + esi]	; adds second element of arrayW to eax
		add esi,4				; moves third element of arrayW to esi
		add eax,[arrayW + esi]	; adds third element of arrayW to eax
		
		;Slide 21
		;A)
			mov ax,6
			mov ecx,4

		L1: 
			inc ax
			loop L1				;ax = 10

		;B) 
			mov ecx,0
		X2:
			inc ax	
			loop X2				;ecx = 4.2Billion
		
		;slide 26
		
		;slide 29
			mov esi,0					; set esi to 0
			mov eax,0					; set eax to 0
			mov ecx,SIZEOF source		; ecx loop counter
			mov	eax,OFFSET source		; offset of source
			mov esi,OFFSET target		; offset of target
		L1:
			mov dl,[eax]				; get next array element of source
			inc eax						; increment source offset
			mov [esi],dl				; set next array element for target
			inc esi						; increment target offset
		loop L1							; loop until ecx = 0
		!

		




	INVOKE ExitProcess,0			;Exit program
main ENDP

	;Procedures go here.

END main