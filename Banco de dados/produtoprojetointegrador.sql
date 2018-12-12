
Processador i3


252614949532
1 caixa (1 cooler + processador + manual)
200g 25cm x 20cm x 15cm













INSERT INTO produtos VALUES ('1', 'Monitor 19"', '3.90' , 'Pol' , '5' , 'Monitor S19' )
INSERT INTO produtos VALUES ('4', 'Monitor 20"', '1200' , 'Pol' , '9' , 'Monitor S20' )
INSERT INTO produtos VALUES ('9', 'Monitor 27"', '1900' , 'Pol' , '3' , 'Monitor S27' )
INSERT INTO produtos VALUES ('3', ' , marca Intel, cor black piano"', '299.99' , '1 caixa combo 200g' , '15' , 'Teclado sem fio' )
INSERT INTO produtos VALUES ('2', 'Processador i3 , marca Intel, cor black piano"', '350' , '1 caixa combo 200g' , '10' , 'Teclado sem fio' )
INSERT INTO produtos VALUES ('5', 'Processador i5 , marca Intel, cor black piano"', '399.99' , '1 caixa combo 200g' , '20' , 'Teclado sem fio' )
INSERT INTO produtos VALUES ('6', 'Processador i5 , marca Intel, cor black piano"', '450.50' , '1 caixa combo 200g' , '25' , 'Teclado sem fio' )
INSERT INTO produtos VALUES ('7', 'Processador i7, marca Intel, cor black piano"', '700' , '1 caixa combo 200g' , '20' , 'Teclado sem fio' )
INSERT INTO produtos VALUES ('8', 'Processador i7 , marca Intel, cor black piano"', '965' , '1 caixa combo 200g' , '30' , 'Teclado sem fio' )
INSERT INTO produtos VALUES ('10', 'Processador i9 , marca Intel, cor black piano"', '1800' , '1 caixa combo 200g' , '35' , 'Teclado sem fio' )
INSERT INTO produtos VALUES ('10', 'Processador i9 , marca Intel, cor black piano"', '2100' , '1 caixa combo 200g' , '5' , 'Teclado sem fio' )



SELECT * FROM pessoas ORDER BY nome
SELECT * FROM pessoas ORDER BY FONE

 
select * from produtos order by ean13

select * from produtos

CREATE TABLE public.produtos
(
  EAN13 character varying(13) NOT NULL,
  descricaoProduto character varying(50) NOT NULL,
  precoProduto character varying(14) NOT NULL,
  unidMedida character varying(10) NOT NULL,
  qtdEstoque character varying(5) NOT NULL,
  nomeProduto character varying(30) NOT NULL,
  CONSTRAINT produtos_pkey PRIMARY KEY (EAN13)
)