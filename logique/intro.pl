% Description des faits quon connait
canide(chien).
canide(loup).

felin(chat).
felin(tigre).

% Les règles
% animal(X) :- canide(X).
% animal(X) :- felin(X).
animal(X) :- canide(X) ; felin(X).
