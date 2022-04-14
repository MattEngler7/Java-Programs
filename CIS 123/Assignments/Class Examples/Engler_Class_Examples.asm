; Authors: Matt Engler, Donnovan Larson-Hale
; Class: CIS123 Assembly Language
; File Name: Engler_Class_Example.asm
; Creation Date: 9/19/19
; Program Description: 
;                       

.386								;32 bit program.
.model flat,stdcall					;Memory model.
.stack 4096							;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword	;Exit procedure prototype.

.data
	COMMENT !
	SLIDE # 12
	bVal  BYTE   100
	bVal2 BYTE   ?
	wVal  WORD   2
	dVal  DWORD  5
	! COMMENT

	COMMENT !
	SLIDE # 23
	arrayD DWORD 1,2,3
	! COMMENT

	COMMENT !
	SLIDE # 29
	myByte BYTE 0FFh, 0					;array declared
	!

	COMMENT !
	SLIDE # 35
	Rval DWORD ?						;Unknown Variable for total
	Xval DWORD 26						;Variable
	Yval DWORD 30						;Variable
	Zval DWORD 40						;Variable
	!

	COMMENT !
	SLIDE #59
	varB BYTE 65h,31h,02h,05h
	varW WORD 6543h,1202h
	varD DWORD 12345678h
	!


.code
	main PROC
		COMMENT !
		SLIDE # 12
 		;mov ds,45						;DS is a 16-bit segment register 
		;mov ax,wVal					;This is correct moving something small into something big
		;mov eip,dVal					;Cannot move into an instruction pointer
		;mov 25,bVal					;Cannot put value into destination 
		;mov bVal2,bVal					;Cannot use two memmory addresses
		! 

		COMMENT !
		SLIDE # 23
		mov eax, arrayD
		xchg eax, [arrayD+4]
		xchg eax, [arrayD+8]
		mov arrayD,eax
		! 
		
		COMMENT !
		SLIDE # 29
		mov al,myByte					;AL = FF
		mov ah,[myByte+1]				;AH = 00
		dec ah							;AH = FF
		inc al							;AL = 00
		dec ax							;AX = FEFF
		!


		COMMENT !
		SLIDE # 35
		mov ebx,Yval					;Rval = Xval - (-Yval + Zval)
		neg ebx							;Rval = Xval - (-30 + Zval)
		add ebx,Zval					;Rval = Xval - (-30 + 40)
		mov eax,Xval					;Rval = 26 - (10)
		sub eax,ebx						;Rval = 16
		mov Rval,eax					;Rval = 16 = EAX					
		!


		COMMENT !
		SLIDE # 44
		mov ax,00FFh
		add ax,1						;AX=0100h	SF=0		ZF=0		CF=0
		sub ax,1						;AX=00FFh	SF=0		ZF=0		CF=0				
		add al,1						;AL=00h 	SF=0		ZF=1		CF=1
		mov bh,6Ch
		add bh,95h						;BH=01      SF=0		ZF=0		CF=1

		mov al,2
		sub al,3						;AL=FFh 	SF=1		ZF=0		CF=1
		!

		
		COMMENT !
		SLIDE # 48
		mov al, -128
		neg al							;CF=1			OF=1 

		mov ax, 8000h
		add ax, 2						;CF=0			OF=0

		mov ax, 0 
		sub ax, 2						;CF=1			OF=0

		mov al, -5
		sub al, +125					;OF=1
		!

		COMMENT !
		SLIDE #59 
		mov ax,WORD PTR [varB+2]		;a. 502h
		mov bl,BYTE PTR varD			;b. 78h
		mov bl,BYTE PTR [varW+2]		;c. 02h
		mov ax,WORD PTR [varD+2]		;d. 1234h
		mov eax,DWORD PTR varw			;e. 12026543h
		!


		INVOKE ExitProcess,0				;Exit program
	main ENDP

;Procedures go here.

END main