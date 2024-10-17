% Faits
dependance(doctrine, symphony).
dependance(twig, symphony).

dependance(doctrine/dbal, doctrine).
dependance('php8.1', doctrine/dbal).

dependance('php8.0', twig).

% Règles
dependance_recursive(X, Y) :- dependance(X, Y).
dependance_recursive(X, Y) :- dependance(X, Z) , dependance_recursive(Z, Y).
