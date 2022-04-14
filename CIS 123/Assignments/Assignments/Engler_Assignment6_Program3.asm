; Author: Matthew Engler
; Class: CIS123 Assembly Language
; File Name: Engler_Assignment6_Program3.asm
; Creation Date: 11/6/19
; Program Description: Program is designed to go through if statements to decide
;                      whether you are able to buy a house or not based off
;                      of numbers coded into the program.

INCLUDE Irvine32.inc			;Use Irvine32 library.

.data
	TRUE = 1
	FALSE = 0
	walletAmmount DWORD 275000
	creditScore WORD 450
	OkTOBuy BYTE ?
	msg BYTE "Find out if you can buy a house.",0
	str1 BYTE "You can buy a house!!",0
	str2 BYTE "Sorry you cannot buy a house. :(",0

.code
main PROC
	call Clrscr
	mov edx, OFFSET msg
	call WriteString
	call Crlf
	mov OkToBuy, FALSE
	mov al,OkToBuy
	.IF walletAmmount > 500000
		mov OkToBuy,TRUE
		mov al,OkToBuy
	.ELSEIF (walletAmmount > 350000) && (creditScore >=400)
		mov OkToBuy,TRUE
		mov al,OkToBuy
	.ELSEIF (walletAmmount > 200000) && (creditScore >= 400)
		mov OkToBuy,True
		mov al,OkToBuy
	.ELSE
		mov OkToBuy,FALSE
		mov al,OkToBuy
	.ENDIF

	.IF al >= OkToBuy
		mov edx,OFFSET str1
		call WriteString
	.ELSE
		mov edx,OFFSET str2
		call WriteString
	.ENDIF
	

 	exit						;Exit program.
main ENDP

END main