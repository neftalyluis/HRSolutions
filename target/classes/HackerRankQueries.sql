/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  samas
 * Created: Jan 11, 2017
 */
SELECT 
CASE 
    WHEN A + B > C AND A + C > B AND B + C > A THEN 
        CASE 
            WHEN A = B AND B = C THEN 'Equilateral' 
            WHEN A = B OR B = C OR A = C THEN 'Isosceles' 
            WHEN A != B OR B != C OR A != C THEN 'Scalene' 
        END 
    ELSE 'Not A Triangle' 
END 
FROM TRIANGLES;

SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY) ASC, CITY LIMIT 1;
SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY) DESC, CITY LIMIT 1;


SELECT CONCAT(NAME,'(',SUBSTRING(OCCUPATION,1,1),')') FROM OCCUPATIONS ORDER BY NAME ASC;

SELECT CONCAT('There are total',' ',COUNT(OCCUPATION),' ',LOWER(OCCUPATION),'s. ') AS TOTAL
FROM OCCUPATIONS GROUP BY OCCUPATION ORDER BY TOTAL;