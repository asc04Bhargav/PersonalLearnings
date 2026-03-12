IDENTIFICATION DIVISION.
       PROGRAM-ID. CUSTOMER-MANAGEMENT.
       
       DATA DIVISION.
       LINKAGE SECTION.
       01 LS-CUSTOMER-ID               PIC X(10).
       01 LS-RETURN-CODE               PIC 9(2).

       WORKING-STORAGE SECTION.
       *> ... (previous working storage declarations remain)

       PROCEDURE DIVISION USING LS-CUSTOMER-ID, LS-RETURN-CODE.
           *> ... (previous main logic remains)
           
           *> Add validation before account creation
           CALL "VALIDATE-CUSTOMER" 
               USING LS-CUSTOMER-ID, LS-RETURN-CODE
           IF LS-RETURN-CODE NOT = 0
               EXIT PROGRAM
           END-IF.