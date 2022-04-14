; Author: Matthew Engler
; Class: CIS123 Assembly Language
; File Name: Engler_Assignment6_Program1.asm
; Creation Date: 11/6/19
; Program Description: Program is deisnged to calcualte grades based on 
;					   a certain range the integer is going to be put into
;                      using if and elseif statements.

INCLUDE Irvine32.inc			;Use Irvine32 library.

.data
	grade BYTE ?,0
	gradeA BYTE "A",0			
	gradeB BYTE "B",0
	gradeC BYTE "C",0
	gradeD BYTE "D",0
	gradeF BYTE "F",0
	not_found BYTE "The integer is not between 0 and 100",0

.code
main PROC
	call Randomize
	mov ecx,10					;sets a counter for 10 numbers

	LOOP1:
		mov eax,51				
		call RandomRange		;chooses a random number.
		add eax,50				;add 50 to that random number generated.
		call CalcGrade			;called to calculate grade.
		mov edx,0				;sets edx to be zero.
		mov grade,al			;moves the result from al to grade.
		mov edx, OFFSET grade	;puts the result from grade into EDX.
		call WriteString		;outputs the result to the console.
		call Crlf
		loop LOOP1

	exit						;Exit program.
main ENDP
	CalcGrade PROC
		.IF(eax <= 100 && eax >= 0)		;determins if the number is between 0 and 100.
		.IF(eax <= 100)&&(eax>89)		;determins if the nuber is between 100 and 89 for an A.
			mov al,gradeA				;moves gradeA to al.
		.ELSEIF(eax < 90)&&(eax > 79)	;determines if its between the numbers for the letter grade.
			mov al,gradeB				;moves gradeB to al.
		.ELSEIF(eax < 80)&&(eax > 69)	;determines if its between the numbers for the letter grade.
			mov al,gradeC				;moves gradeC to al.
		.ELSEIF(eax < 70)&&(eax > 59)	;determines if its between the numbers for the letter grade.
			mov al,gradeD				;moves gradeD to al.
		.ELSE							;else is made for anything less than D is an F. 
			mov al,gradeF				;moves gradeF to al.
		.ENDIF							;end of the second If.
		.ELSE							
			mov edx,OFFSET not_found	;is made incase the number is bigger or smaller than 0 to 100.
		call WriteString				;outputs string "not_found"
		call Crlf
		ret
		.ENDIF
		ret
	CalcGrade ENDP
	

END main