; Author: Tyler Foster, Matt Engler, Ernesto Joaquin
; Class: CIS123 Assembly Language
; File Name: TeamF_Lab5.asm
; Creation Date: 10/10/2019
; Program Description: Display signed integer into console as decimal, hex, and binary.
;                      
;                      

INCLUDE Irvine32.inc			;Use Irvine32 library.

.data
	prompt BYTE "Enter a 32-bit signed integer: ",0

.code
main PROC
	mov edx,OFFSET prompt
	call WriteString
	call ReadInt				; input integer into EAX
	call Crlf					; display a newline
	call WriteInt				; display in signed decimal
	call Crlf
	call WriteHex				; display in hexadecimal
	call Crlf
	call WriteBin				; display in binary
	call Crlf
	call Crlf



	  INVOKE ExitProcess, 0



	exit						;Exit program.
main ENDP


	;Procedures go here.

END main