package com.openelements.cardless.data;

import java.util.List;

public record Requisition(String id, String created, String redirect, String status, String institution_id,
                          String agreement, String reference, List<String> accounts, String link) {
}
