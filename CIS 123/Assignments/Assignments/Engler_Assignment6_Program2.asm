; Author: Matthew Engler
; Class: CIS123 Assembly Language
; File Name: Engler_Assignment6_Program2.asm
; Creation Date: 11/6/19
; Program Description: Program is designed to get a users input using a menu
;                      and then input some integers to be calculated and outputed
;                      to the user.

INCLUDE Irvine32.inc			;Use Irvine32 library.

.data
	DisplayMenu BYTE "Calculator for Boolean", 0dh,0ah
				BYTE 0dh,0ah
				BYTE "1. x AND y"		,0dh,0ah
				BYTE "2. x or y"		,0dh,0ah
				BYTE "3. NOT x"			,0dh,0ah
				BYTE "4. x XOR y"		,0dh,0ah
				BYTE "5. Exit Program"	,0

	prompt1 BYTE "Enter the First number: ",0
	prompt2 BYTE "Enter the Second number: ",0
	final BYTE "Total: ",0

	caseTable BYTE '1'				;table created to lookup values.
		DWORD AND_Operation
	EntrySize = ($ - caseTable)
		BYTE '2'					;lookup value.
			DWORD OR_Operation		;addressing the procedure.
		BYTE '3'
			DWORD NOT_Operation		;look up value.
		BYTE '4'					;addressing the procedure.
			DWORD XOR_Operation
		BYTE '5'					;look up value.
			DWORD exitProgram		;addressing the procedure.

	numEnteries = ($ - caseTable)/EntrySize	;Find the number of enteries.
.code
main PROC
		call Clrscr					;clear console window
	MLOOP:
		mov edx,OFFSET DisplayMenu	;get address of the DisplayPrompt into edx.
		call WriteString			;display the prompt string.
		call Crlf					;goes to a new line.

	INPUT:
		call ReadChar				;Read the input from the user.
		cmp al,'5'					;compare if the input is 5.
		ja INPUT					;jump if above 5, go back.
		cmp al,'1'
		jb INPUT					;jump to getInput if below 1, go back.
		call Crlf					;goes to a new line.
		call selectProcedure		;calls procedure.
		jc quit						;jump if carry = 1, exit.
		call Crlf
		jmp MLOOP					;jump to Menu to display the menu again.
		quit:exit
	exit							;Exit program.
main ENDP

	selectProcedure PROC			
		push ebx					;push the value of EBX onto stack.
		push ecx					;push the value of ECX onto stack.
		mov ebx,OFFSET caseTable	;moves ebx to the table.
		mov ecx, numEnteries		;ecx equals the number of enteries.

	LOOP1:
		cmp al,[ebx]
		jne LOOP2					;if not equal, jump to L2.
		call NEAR PTR [ebx + 1]		;if yes call procedure.
		jmp LOOP3

	LOOP2:
		add ebx, EntrySize			;increment and go to next entry.
		loop LOOP1					;keep going until ecx = 0.

	LOOP3:
		pop ecx						;remove the value of ECX from stack.
		pop ebx						;remove the value of EBX from stack.

		ret							;retun from procedure.

	selectProcedure ENDP

	AND_Operation PROC             
       pushad						;push all registers onto stack
       mov edx, OFFSET prompt1		;ask for first integer
       call WriteString				;print the string prompt1
       call ReadDec					;read the integer value from the user
       mov ebx, eax					;move first integer to EBX
       mov edx, OFFSET prompt2		;ask for second integer
       call WriteString				;print the string prompt2
       call ReadDec					;get second integer
       and eax, ebx					;apply AND operation for integer1, integer2
       mov edx, OFFSET final		;result
       call WriteString				;display result
       call WriteDec				;display result value to the console
       call Crlf
       popad						; save and restore registers
       ret							; return from procedure
AND_Operation ENDP					

OR_Operation PROC					
       pushad						;push all registers onto stack
       mov edx, OFFSET prompt1		;ask for first integer
       call WriteString				;print the string prompt1
       call ReadDec					;read the integer value from the user
       mov ebx, eax					;move first integer to EBX
       mov edx, OFFSET prompt2		;ask for second integer
       call WriteString				;print the string prompt2
       call ReadDec					;get second integer
       or eax, ebx                  ;integer1 OR integer2
       mov edx, OFFSET final		;result of operation
       call WriteString				;display result string
       call WriteDec				;display result value to the console
       call Crlf
       popad						;save and restore registers
       ret                          ;return from procedure
OR_Operation ENDP                   

NOT_Operation PROC                  
       pushad						;push all registers onto stack
       mov edx, OFFSET prompt1		;ask for first integer
       call WriteString				;print the string prompt1
       call ReadDec					;read the integer value from the user
       not eax                      ;NOT operand
       mov edx, OFFSET final		;result of operation
       call WriteString				;display result string
       call WriteDec				;EAX = result
       call Crlf
       popad                        ;restore registers
       ret                          ;return from procedure
NOT_Operation ENDP                  

XOR_Operation PROC                  
       pushad						;push all registers onto stack
       mov edx, OFFSET prompt1		;ask for first operand
       call WriteString				;print the string prompt1
       call ReadDec					;read the integer value from the user
       mov ebx, eax					;move first operand to EBX
       mov edx, OFFSET prompt2		;ask for second operand
       call WriteString				;print the string prompt2
       call ReadDec					;read the integer value from the user
       xor eax, ebx					;integer1 XOR integer2
       mov edx, OFFSET final		;result of operation
       call WriteString				;display result string
       call WriteDec				;display result value to the console
       call Crlf
       popad                        ;save and restore registers
       ret                          ;return from procedure
XOR_Operation ENDP                     

exitProgram PROC					   
       stc							;set the carry flag to 1
       ret							;return from procedure
exitProgram ENDP					    

END main							