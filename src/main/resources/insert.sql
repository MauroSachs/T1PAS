-- Create a user
INSERT INTO usuario_model (id, senha, usuario) VALUES (1, 'senha123', 'admin');

-- Create 10 clients
INSERT INTO cliente_model (id, email, nome) VALUES (1, 'cliente1@example.com', 'Cliente 1');
INSERT INTO cliente_model (id, email, nome) VALUES (2, 'cliente2@example.com', 'Cliente 2');
INSERT INTO cliente_model (id, email, nome) VALUES (3, 'cliente3@example.com', 'Cliente 3');
INSERT INTO cliente_model (id, email, nome) VALUES (4, 'cliente4@example.com', 'Cliente 4');
INSERT INTO cliente_model (id, email, nome) VALUES (5, 'cliente5@example.com', 'Cliente 5');
INSERT INTO cliente_model (id, email, nome) VALUES (6, 'cliente6@example.com', 'Cliente 6');
INSERT INTO cliente_model (id, email, nome) VALUES (7, 'cliente7@example.com', 'Cliente 7');
INSERT INTO cliente_model (id, email, nome) VALUES (8, 'cliente8@example.com', 'Cliente 8');
INSERT INTO cliente_model (id, email, nome) VALUES (9, 'cliente9@example.com', 'Cliente 9');
INSERT INTO cliente_model (id, email, nome) VALUES (10, 'cliente10@example.com', 'Cliente 10');

-- Create 5 applications
INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (1, 29.99, 'App 1');
INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (2, 19.99, 'App 2');
INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (3, 9.99, 'App 3');
INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (4, 14.99, 'App 4');
INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (5, 39.99, 'App 5');

-- Create 5 subscriptions
INSERT INTO assinatura_model (id, fim_vigencia, inicio_vigencia, aplicativo_id, cliente_id)
VALUES (1, '2024-12-31 23:59:59', '2024-01-01 00:00:00', 1, 1);

INSERT INTO assinatura_model (id, fim_vigencia, inicio_vigencia, aplicativo_id, cliente_id)
VALUES (2, '2024-12-31 23:59:59', '2024-01-01 00:00:00', 2, 2);

INSERT INTO assinatura_model (id, fim_vigencia, inicio_vigencia, aplicativo_id, cliente_id)
VALUES (3, '2024-12-31 23:59:59', '2024-01-01 00:00:00', 3, 3);

INSERT INTO assinatura_model (id, fim_vigencia, inicio_vigencia, aplicativo_id, cliente_id)
VALUES (4, '2024-12-31 23:59:59', '2024-01-01 00:00:00', 4, 4);

INSERT INTO assinatura_model (id, fim_vigencia, inicio_vigencia, aplicativo_id, cliente_id)
VALUES (5, '2024-12-31 23:59:59', '2024-01-01 00:00:00', 5, 5);

-- Optionally, create payments for the subscriptions
INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (1, '2024-01-01', 'Promo 1', 29.99, 1);

INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (2, '2024-01-01', 'Promo 2', 19.99, 2);

INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (3, '2024-01-01', 'Promo 3', 9.99, 3);

INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (4, '2024-01-01', 'Promo 4', 14.99, 4);

INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (5, '2024-01-01', 'Promo 5', 39.99, 5);

-- Link payments to subscriptions
INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (1, 1);
INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (2, 2);
INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (3, 3);
INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (4, 4);
INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (5, 5);
