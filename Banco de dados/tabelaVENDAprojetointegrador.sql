




CREATE TABLE vendas
(
    id 			INT,
    nf  		VARCHAR(40),
    nomeCliente         VARCHAR(80),
    cpfCliente		VARCHAR(15),
    nomeProduto    	VARCHAR(100),
    descricaoProduto   	VARCHAR(100),
    qtdTotal		INT,
    valorTotal		DECIMAL(10,2)
    
)

INSERT INTO vendas VALUES ('1', '1645468' , 'JoaoTESTE' , '12021684848' , 'Monitor 19"', 'Monitor S19 19"' , '5' , '800.00' );
INSERT INTO vendas VALUES ('2', '1752644' , 'JoaoTESTE' , '12021684848' , 'Monitor 20"', 'Monitor S19 19"' , '5' , '800.00' );
INSERT INTO vendas VALUES ('3', '1879661' , 'JoaoTESTE' , '12021684848' , 'Monitor 20"', 'Monitor S19 19"' , '5' , '800.00' );
INSERT INTO vendas VALUES ('4', '1926846' , 'JoaoTESTE' , '12021684848' , 'CPU DELL"'  , 'Monitor S19 19"' , '5' , '800.00' );
INSERT INTO vendas VALUES ('5', '2054941' , 'JoaoTESTE' , '12021684848' , 'mouse sem fio"', 'Monitor S19 19"' , '5' , '800.00' );
INSERT INTO vendas VALUES ('6', '2110242' , 'JoaoTESTE' , '12021684848' , 'Mochila Tilibra"', 'Monitor S19 19"' , '5' , '800.00' );
INSERT INTO vendas VALUES ('7', '1020304' , 'JoaoTESTE' , '12021684848' , 'Monitor 19"', 'Monitor S19 19"' , '5' , '800.00' );
INSERT INTO vendas VALUES ('8', '9080501' , 'JoaoTESTE' , '12021684848' , 'Monitor 19"', 'Monitor S19 19"' , '5' , '800.00' );
INSERT INTO vendas VALUES ('9', '5060302' , 'JoaoTESTE' , '12021684848' , 'Monitor 19"', 'Monitor S19 19"' , '5' , '800.00' );
INSERT INTO vendas VALUES ('10', '2030450' , 'JoaoTESTE' , '12021684848' , 'Monitor 19"', 'Monitor S19 19"' , '5' , '800.00' )

select * from vendas

drop table vendas

select * from produtos