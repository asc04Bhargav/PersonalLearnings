IDENTIFICATION DIVISION.
       PROGRAM-ID. TRANSACTION-PROCESSING.
       
       DATA DIVISION.
       LINKAGE SECTION.
       01 LS-ACCOUNT-NUMBER            PIC X(12).
       01 LS-RETURN-CODE               PIC 9(2).

       WORKING-STORAGE SECTION.
       *> ... (previous working storage declarations remain)

       PROCEDURE DIVISION USING LS-ACCOUNT-NUMBER, LS-RETURN-CODE.
           *> Validate account exists before processing transaction
           CALL "VALIDATE-ACCOUNT" 
               USING LS-ACCOUNT-NUMBER, LS-RETURN-CODE
           IF LS-RETURN-CODE NOT = 0
               EXIT PROGRAM
           END-IF.