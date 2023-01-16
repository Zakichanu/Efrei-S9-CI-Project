/***************************************************************************
DATABASE Mercato
Authors : TOBBAL Zakaria, AMRAOUI Yanis
****************************************************************************/

CREATE TABLE IF NOT EXISTS MERCATO (
    id INT PRIMARY KEY,
    season VARCHAR(100),
    playerName VARCHAR(500),
    teamFrom VARCHAR(500),
    teamTo VARCHAR(500),
    valueTransfer VARCHAR(500),
);