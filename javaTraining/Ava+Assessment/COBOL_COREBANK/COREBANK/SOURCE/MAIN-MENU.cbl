IDENTIFICATION DIVISION.
       PROGRAM-ID. MAIN-MENU.
       
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 WS-CHOICE                    PIC 9(1).
       01 WS-EXIT                      PIC X(1).
       01 WS-CUSTOMER-ID               PIC X(10).
       01 WS-ACCOUNT-NUMBER            PIC X(12).
       01 WS-RETURN-CODE               PIC 9(2).
           88 SUCCESS                  VALUE 00.
           88 CUSTOMER-NOT-FOUND       VALUE 10.
           88 ACCOUNT-NOT-FOUND        VALUE 20.
           88 TRANSACTION-FAILED       VALUE 30.

       PROCEDURE DIVISION.
       MAIN-PARA.
           PERFORM UNTIL WS-EXIT = "Y"
               DISPLAY "=== CORE BANKING SYSTEM ==="
               DISPLAY "1. Customer Management"
               DISPLAY "2. Account Management"
               DISPLAY "3. Transaction Processing"
               DISPLAY "4. Exit"
               DISPLAY "Enter choice: "
               ACCEPT WS-CHOICE
               
               EVALUATE WS-CHOICE
                   WHEN 1
                       CALL "CUSTOMER-MANAGEMENT" 
                           USING WS-CUSTOMER-ID, WS-RETURN-CODE
                   WHEN 2
                       CALL "ACCOUNT-MANAGEMENT"
                           USING WS-CUSTOMER-ID, WS-ACCOUNT-NUMBER, 
                                 WS-RETURN-CODE
                   WHEN 3
                       CALL "TRANSACTION-PROCESSING"
                           USING WS-ACCOUNT-NUMBER, WS-RETURN-CODE
                   WHEN 4
                       MOVE "Y" TO WS-EXIT
                   WHEN OTHER
                       DISPLAY "Invalid choice"
               END-EVALUATE
               
               PERFORM CHECK-RETURN-CODE
           END-PERFORM
           STOP RUN.

       CHECK-RETURN-CODE.
           EVALUATE TRUE
               WHEN CUSTOMER-NOT-FOUND
                   DISPLAY "Customer not found"
               WHEN ACCOUNT-NOT-FOUND
                   DISPLAY "Account not found"
               WHEN TRANSACTION-FAILED
                   DISPLAY "Transaction failed"
           END-EVALUATE.