; Author: Matt Engler
; Class: CIS123 Assembly Language
; File Name: Engler_Assignment3_Program2.asm
; Creation Date: 9/17/19
; Program Description: Program is designed to define data types of BYTE and so forth
;                      and initalize each variable to a value with its data type. 

.386								;32 bit program.
.model flat,stdcall					;Memory model.
.stack 4096							;Stack allocation 4,096 bytes.
ExitProcess proto,dwExitCode:dword	;Exit procedure prototype.

.data
	MyValue1 BYTE 255				;Defines 8-bits of storage
	MyValue2 SBYTE -33				;this can hold a negative value
	MyValue3 WORD 65535				;Defines storage for a 16-bit integer
	MyValue4 SWORD -45565			;Holds a 16 bit negtive integer
	MyValue5 DWORD 12345678			;Defines it as a double word which doubles the storage bits to 32-bit Integers
	MyValue6 SDWORD -12345678		;Holds a double negative word at 32-bits
	MyValue7 QWORD 1234567812345678 ;Holds a quad word so it holds 64-bits
	MyValue8 REAL4 -1.2				;Defines a 4-byte floating point variable
.code
main PROC
	

INVOKE ExitProcess,0				;Exit program
main ENDP

;Procedures go here.

END main