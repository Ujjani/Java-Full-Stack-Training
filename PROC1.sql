CREATE OR REPLACE PROCEDURE PROC1(NO NUMBER)
IS 
BEGIN
for i in 1..NO loop
dbms_output.put_line('Testing of procedure');
end loop;
end;
/