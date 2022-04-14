; Author: Your name goes here
; Class: CIS123 Assembly Language
; File Name: Group_Project.asm
; Creation Date: The date you first created this program
; Program Description: Describe with a short paragraph what your
;                      program does and its purpose. Explain in general
;                      terms the expected inputs and output result.

INCLUDE Irvine32.inc			;Use Irvine32 library.

.data
		menuSTR BYTE "Order Menu"								,0
		welcomeSTR BYTE "Welcome, please select something. "	,0
		prompt1 BYTE "1. Burger $2.00"							,0
		prompt2	BYTE "2. Burger with Fries $3.00"				,0
		prompt3 BYTE "3. Burger Combo $4.00"					,0
		prompt4 BYTE "4. Milkshake $2.00"						,0
		prompt5 BYTE "5. Fries $1.00"							,0
		prompt6 BYTE "6. End Order."							,0
		prompt7 BYTE "Enter name for order: "					,0
		prompt8 BYTE "Order Selection: "						,0
		prompt9 BYTE "*Enter Something from the Selection!*"	,0
		total	BYTE "Total: $"									,0

		promptB	 BYTE ".00 -Burger"								,0
		promptBF BYTE ".00 -Burger with Fries"					,0
		promptBC BYTE ".00 -Burger Combo"						,0
		promptM	 BYTE ".00 -Milkshake"							,0
		promptF	 BYTE ".00 -Fries"								,0

		orderArray BYTE ?
		totalArray DWORD ?

.code
main PROC
	call Clrscr

		mov edx, OFFSET menuSTR
		call WriteString
		call Crlf
		mov edx, OFFSET welcomeSTR
		call WriteString
		call Crlf
		mov edx, OFFSET prompt1
		call WriteString
		call Crlf
		mov edx, OFFSET prompt2
		call WriteString
		call Crlf
		mov edx, OFFSET prompt3
		call WriteString
		call Crlf
		mov edx, OFFSET prompt4
		call WriteString
		call Crlf
		mov edx, OFFSET prompt5
		call WriteString
		call Crlf
		mov edx, OFFSET prompt6
		call WriteString
		call Crlf
		call Crlf
		
	Input:
		mov edx, OFFSET prompt8
		call WriteString
		call ReadInt
		call Crlf
		jmp Choice1

	loop Input

	Choice1:
		mov edi, OFFSET orderArray
		mov esi, OFFSET totalArray
		.IF eax == 1
			
			mov eax, 2
			call Burger

		.ELSEIF eax == 2
			
			mov eax,3
			call BurgerF

		.ELSEIF eax == 3

			mov eax,4
			call BurgerC
		
		.ElSEIF eax == 4

			mov eax,2
			call Milkshake
		
		.ELSEIF eax >= 4
			jmp Choice2
			
		.ENDIF

			mov al,'$'
			Call WriteChar
			mov eax,[esi]
			Call WriteDec
			mov eax, [edi]
			Call WriteString
			Call Crlf
			Call Crlf
		ja Input
		loop Choice1

	;***Made for additional selections.***
	Choice2:
		.IF eax == 5
			mov eax,1
			call Fry
				mov al,'$'
				Call WriteChar
				mov eax,[esi]
				Call WriteDec
				mov eax, [edi]
				Call WriteString
				Call Crlf
				Call Crlf

		.ELSEIF eax == 6
			;***enter name for order***
			mov edx, OFFSET prompt7
			Call PROMPT

		;***if over the input of 6 prompt them to enter something from selection.***		
		.ELSEIF eax > 6
			mov edx, OFFSET prompt9
			Call PROMPT
		.ENDIF

		;call ReadString
		
		ja Input

	loop Choice2

	exit						;Exit program.
main ENDP

	;***Procedures can be made into INVOKE***
	;***Was made since it was too much to keep in the loop***
	;***threw exception for destination being to far for byte type.***


	;***Procdure for Burger prompt***
	Burger Proc
		mov [esi],eax
		Push [esi]
		mov edx, OFFSET promptB
		mov [edi], edx
		Push [edi] 
		add esi, 4
		add edi, 4
		Pop [edi]
		Pop [esi]
		ret
	Burger ENDP

	;***Burger and Fry Call Proc***
	BurgerF Proc
		mov [esi],eax
		Push [esi]
		mov edx, OFFSET promptBF
		mov [edi], edx
		Push [edi] 
		add esi, 4
		add edi, 4
		Pop [edi]
		Pop [esi]
		ret
	BurgerF ENDP

	;***Burger Combo Call Proc***
	BurgerC Proc
		mov [esi],eax
		Push [esi]
		mov edx, OFFSET promptBC
		mov [edi], edx
		Push [edi] 
		add esi, 4
		add edi, 4
		Pop [edi]
		Pop [esi]
		ret
	BurgerC ENDP

	;***Milkshake Call Proc***
	Milkshake Proc
		mov [esi],eax
		Push [esi]
		mov edx, OFFSET promptM
		mov [edi], edx
		Push [edi] 
		add esi, 4
		add edi, 4
		Pop [edi]
		Pop [esi]
		ret
	Milkshake ENDP

	;***Fries Call Proc***
	Fry Proc
		mov [esi],eax
		Push [esi]
		mov edx, OFFSET promptF
		mov [edi], edx
		Push [edi] 
		add esi, 4
		add edi, 4
		Pop [edi]
		Pop [esi]
		ret
	Fry ENDP

	;***Was made for outputting messages to the user.***
	PROMPT PROC
		mov [edi], edx
		Push [edi] 
		add edi, 4
		Pop [edi]
		mov eax, [edi]
		Call WriteString
		Call Crlf
		Call Crlf
		ret
	PROMPT ENDP
	
END main