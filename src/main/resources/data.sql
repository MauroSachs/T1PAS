INSERT INTO usuario_model (id, senha, usuario) VALUES (1, 'senha123', 'admin');

INSERT INTO cliente_model (id, email, nome) VALUES (1, 'joao.silva@example.com', 'João Silva');
INSERT INTO cliente_model (id, email, nome) VALUES (2, 'maria.souza@example.com', 'Maria Souza');
INSERT INTO cliente_model (id, email, nome) VALUES (3, 'ana.costa@example.com', 'Ana Costa');
INSERT INTO cliente_model (id, email, nome) VALUES (4, 'carlos.oliveira@example.com', 'Carlos Oliveira');
INSERT INTO cliente_model (id, email, nome) VALUES (5, 'lucas.pereira@example.com', 'Lucas Pereira');
INSERT INTO cliente_model (id, email, nome) VALUES (6, 'fernanda.lima@example.com', 'Fernanda Lima');
INSERT INTO cliente_model (id, email, nome) VALUES (7, 'bruno.alves@example.com', 'Bruno Alves');
INSERT INTO cliente_model (id, email, nome) VALUES (8, 'juliana.rodrigues@example.com', 'Juliana Rodrigues');
INSERT INTO cliente_model (id, email, nome) VALUES (9, 'roberto.martins@example.com', 'Roberto Martins');
INSERT INTO cliente_model (id, email, nome) VALUES (10, 'patricia.fernandes@example.com', 'Patrícia Fernandes');

INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (1, 29.99, 'Netflix');
INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (2, 19.99, 'Spotify');
INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (3, 9.99, 'Amazon Prime Video');
INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (4, 14.99, 'Disney+');
INSERT INTO aplicativo_model (id, custo_mensal, nome) VALUES (5, 39.99, 'HBO Max');

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

INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (1, '2024-01-01', 'Cupom15', 29.99, 1);

INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (2, '2024-01-01', 'Cupom50', 19.99, 2);

INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (3, '2024-01-01', 'none', 9.99, 3);

INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (4, '2024-01-01', 'none', 14.99, 4);

INSERT INTO pagamento_model (id, data_pagamento, promocao, valor_pago, assinatura_id)
VALUES (5, '2024-01-01', 'none', 39.99, 5);

INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (1, 1);
INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (2, 2);
INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (3, 3);
INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (4, 4);
INSERT INTO assinatura_model_pagamentos (assinatura_model_id, pagamentos_id) VALUES (5, 5);
