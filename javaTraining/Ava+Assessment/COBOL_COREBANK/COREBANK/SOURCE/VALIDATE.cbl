IDENTIFICATION DIVISION.
       PROGRAM-ID. VALIDATE-CUSTOMER.
       
       DATA DIVISION.
       LINKAGE SECTION.
       01 LS-CUSTOMER-ID               PIC X(10).
       01 LS-RETURN-CODE               PIC 9(2).
       
       PROCEDURE DIVISION USING LS-CUSTOMER-ID, LS-RETURN-CODE.
           *> Check if customer exists
           *> Set return code accordingly
           EXIT PROGRAM.

       IDENTIFICATION DIVISION.
       PROGRAM-ID. VALIDATE-ACCOUNT.
       
       DATA DIVISION.
       LINKAGE SECTION.
       01 LS-ACCOUNT-NUMBER            PIC X(12).
       01 LS-RETURN-CODE               PIC 9(2).
       
       PROCEDURE DIVISION USING LS-ACCOUNT-NUMBER, LS-RETURN-CODE.
           *> Check if account exists
           *> Set return code accordingly
           EXIT PROGRAM.